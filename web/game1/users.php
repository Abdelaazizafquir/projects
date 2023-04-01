<?php 
session_start();
if(!array_key_exists("admin",$_SESSION)){
    header("location:login.php");
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    <link rel="stylesheet" href="public/style/style.css">
    <title>users</title>
</head>
<body>
    <div class="title">
        users
    </div>
    <a href="index.php"><i class="fa-solid fa-house" id="logicon"></i></a>
    <form action="" method="get">
    <div class="logout" >
        <input type="submit" name="logout" class="logou" value="log out" >
 </div>
    </form>
    <?php 
    if(isset($_GET["logout"])){
        unset($_SESSION['admin']);
        header("location:login.php");
    }
    ?>
<div class="container">
<?php
   function con(){
    try{ $db = new PDO('mysql:host=localhost;dbname=jeux', 'root', '');
     $req = $db->prepare('select * from users');
     $req->execute();
     $res = $req->fetchAll();
     return $res;
  }catch(PDOException $e){
     echo $e->getMessage();
  }
 }
$rese = con();
    foreach($rese as $a){
                echo " <div class='user'>
     <a href='supuser.php?id=".$a["id"]."'><i class='fa-solid fa-trash' id='supicon'></i></a>
    <img src="."public/img/".$a["id"].".png".">
    <h1 >username:".$a["username"]."</h1>
    <h1 >score:".$a["score"]."</h1>
</div>";
    }

    
    ?>
</div>

</body>
</html>