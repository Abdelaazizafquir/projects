<?php 
      try{ $db = new PDO('mysql:host=localhost;dbname=jeux', 'root', '');
        $req = $db->prepare('delete from users where id='.$_GET["id"].'');
        $req->execute();
        header('location:users.php');
     }catch(PDOException $e){
        echo $e->getMessage();
     }

?>