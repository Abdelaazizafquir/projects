<?php
session_start();
if(isset($_GET["logout"])){
    
    unset($_SESSION["username"]);
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>game</title>
</head>
<body>
    <div class="container">
        <div class="jeux">
            <div class="score">score:<div id="score"></div></div>
            <div class="balle"></div>
            <div class="blanch"></div>
        </div>
        <?php 
       

        if(isset($_SESSION["username"])){
            echo ' <a href="index.php?logout" class="logout"><button>log out</button></a>
            <div class="quite"><button class="save">quite & save</button></div>';
        }
        ?>
        
        <div class="users">
            <h1>users:</h1>
            <?php 
            try{
                $req=new PDO('mysql:host=localhost;dbname=jeuxtest','root','');
                $re=$req->prepare('select username,score from users');
               $re->execute();
                $res=$re->fetchAll();
            
            }catch(PDOException $e){
                echo $e->getMessage();
            }
            
            foreach($res as $v){
                echo '<div class="user">
                <div class="username">user:'.$v['username'].'</div>
                <div class="scoree">score:'.$v['score'].'</div>
            </div>';
            }

            ?>
         
        </div>

        <div class="buttons">
        <?php 
        if(!isset($_SESSION["username"])){
            echo '<div ><button class="login"><a href="login.php">log in</a></button></div>
            <div><button  class="register"><a href="register.php"> register</a></button></div>';
        }
        ?>
        </div>
    </div>
    <script src="script.js"></script>
</body>
</html>