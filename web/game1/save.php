<?php
session_start();
$score = $_GET['score'];
if (isset($_SESSION["username"])) {
    try{ 
        $db = new PDO('mysql:host=localhost;dbname=jeux', 'root', '');
        $sql = 'select score from users where username="'.$_SESSION["username"].'"';
        $req = $db->prepare($sql);
        $res=$req->execute();
        $res = $req->fetchAll();
      $total = $res[0][0];
      $total = $total + $score;
        $sql = 'update users set score='.$total.' where username="'.$_SESSION["username"].'"';
     $req = $db->prepare($sql);
     $req->execute();
  }catch(PDOException $e){
     echo $e->getMessage();
  }
} else{
   echo "log in first";
}



?>