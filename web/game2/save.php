<?php
session_start();
try{
$str='update users set score='.$_GET["score"].' where username="'.$_SESSION["username"].'"';
$req = new PDO('mysql:host=localhost;dbname=jeuxtest', 'root', '');
    $rec=$req->prepare($str);
    $rec->execute();
    header("location:index.php");
}catch(PDOException $a){
    echo $a->getMessage();
}
?>