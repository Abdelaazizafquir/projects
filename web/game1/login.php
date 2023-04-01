<?php
    function con($user,$pas){
       try{ $db = new PDO('mysql:host=localhost;dbname=jeux', 'root', '');
        $req = $db->prepare('select count(*) from users where username="'.$user.'" and password="'.$pas.'"');
        $req->execute();
        $res = $req->fetchAll();
        return $res[0];
     }catch(PDOException $e){
        echo $e->getMessage();
     }
    }


?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="public/style/stylelogin.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    <title>log in</title>
</head>
<body>
<a href="index.php"><i class="fa-solid fa-house" id="logicon"></i></a>
   <div class="container"> 
    <form method="get">
    <div>username</div>
    <input type="text" name="username" required> <br>
    <label for="">password</label> <br>
    <input type="password" name="password" required> <br>
    <a href="register.php" class="link">register</a>
    <input type="submit" name="sm" value="log in" class="butsub">
    </form>
   </div>
   <?php
   session_start();
if(isset($_GET['sm'])){
    $res=con($_GET['username'], $_GET['password']);
         if($_GET["username"]=="admin" && $_GET["password"]=="123"){
            $_SESSION["admin"]=$_GET["username"];
            header('location:index.php');
             exit;
        }
    if($res[0]==1){
        $_SESSION["username"]=$_GET["username"];
        header('location:index.php');
           exit;
    }
    else{
        echo "erreur";
    }
   
}

//    session_start();
//    $data=file_get_contents('data.json');
//    $array=json_decode($data,true);
//    if(isset($_GET["sm"])){
//     foreach($array as $value){
//         if($_GET["username"]=="admin" && $_GET["password"]=="123"){
//             header('location:index.php');
//             $_SESSION["admin"]=$_GET["username"];
//             exit;
//         }
//         else if($_GET["username"]==$value["username"] && $_GET["password"]==$value["password"]){
//             $_SESSION["username"]=$_GET["username"];
//             header('location:index.php');
//             exit;
//         }
//     }
//         header('location:register.php');

   
//    }
   ?>
</body>
</html>