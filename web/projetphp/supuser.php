<?php 
      try{ $db = new PDO('mysql:host=localhost;dbname=gidb', 'root', '');
        $req = $db->prepare('delete from user where id='.$_GET["id"].'');
        $req->execute();
        header('location:users.php');
     }catch(PDOException $e){
        echo $e->getMessage();
     }

?>