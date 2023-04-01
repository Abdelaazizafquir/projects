<?php
    function con($user,$pas){
       try{ $db = new PDO('mysql:host=localhost;dbname=jeuxtest', 'root', '');
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
    <link rel="stylesheet" href="public/style/styleregister.css">
    <title>Register</title>
</head>
<body>
<div class="container">
    <form  method="post">
    <div>username</div>
    <input type="text" name="username" required> 
    <div>password</div>
    <input type="password" name="password" required>
    <input type="submit" name="sm" value="register" class="but">
    </form>
    <?php
       if(isset($_POST["sm"])){
      $i = con($_POST["username"],$_POST["password"]);
            if($_POST["username"]=="admin"){
                echo "<div>can't add a admin </div>";
              exit;
            }

         else if($i[0]==1){
            echo "<div>deja exist</div>";
        }
        else{
           
            try {
                $db = new PDO('mysql:host=localhost;dbname=jeuxtest', 'root', '');
                $sql = 'INSERT INTO users(username, password) VALUES (:u, :p)';
                $req = $db->prepare($sql);
                $req->execute(['u'=>$_POST["username"],'p'=>$_POST["password"]]);
                $res = $req->fetchAll();
                }catch(PDOException $e){
                echo $e->getMessage();
                }
               
            echo "<div>registred successfully <br> <a href='login.php' class='link'>back to login</a></div>";
        }
    }
   ?>
   </div>
  
</body>
</html>