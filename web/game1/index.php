<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="public/style/stylejeux.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    <title>jeux</title>
</head>
<body>
    <div class="container">
        <div class="logout">
        <?php 
     session_start();
     if(isset($_SESSION["username"]) || isset($_SESSION["admin"])){
    echo '<a href="sigout.php"><i class="fa-solid fa-arrow-right-from-bracket" id="signout"></i></a>';
}
if(isset($_SESSION["admin"])){
    echo '<a href="users.php"><i class="fa-solid fa-users" id="users"></i></a>';
}
  ?>
        </div>
        <div class="jeux">
            <div class="scoree">Scroe:<div class="score">0</div></div>
            <div class="totall">total:<div class="total">0</div></div>
        <img src="public/imgd/dice-1.png" id="images" alt="">
        <button class="roll">roll</button>
        <button class="save">save</button>
        <button class="quite">quite</button>
        </div>
        <?php
        if (!isset($_SESSION["username"]) && !isset($_SESSION["admin"])) {
            echo ' <div class="buttons">
            <a href="login.php"><button>log in</button></a>
            <a href="register.php"><button>sign up</button></a>
            </div>';
        }
        ?>
        <div class="users">
        <h1>users:</h1>
        <div class="nn">
        <h2 >Top:</h2>
        <h2 >name:</h2>
        <h2 >score:</h2>
        </div>
       
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
function cmp($a, $b)
{
    if ($a["score"] == $b["score"]) {
        return 0;
    }
    return ($a["score"] > $b["score"]) ? -1 : 1;
}


usort($rese, "cmp");

$i = 0;
    foreach($rese as $a){
         $i++;
        if($a["score"]==null){
                $a["score"] = 0; 
        }
        if(isset($_SESSION["username"])){
            if($a["username"]==$_SESSION["username"]){
                echo " <div class='user' id='you'><h1 id='top'>".$i."</h1>
                <i class='fa-solid fa-user' id='logo'></i>
    <h1 id='name'>".$a["username"]."</h1>
    <h2 id='score'>".$a["score"]."</h2>
</div>";
            }
            else{     echo " <div class='user'><h1 id='top'>".$i."</h1>
                <i class='fa-solid fa-user' id='logo'></i>
    <h1 id='name'>".$a["username"]."</h1>
    <h2 id='score'>".$a["score"]."</h2>
    </div>";
    }
    }
    else{     echo " <div class='user'><h1 id='top'>".$i."</h1>
            <i class='fa-solid fa-user' id='logo'></i>
<h1 id='name'>".$a["username"]."</h1>
<h2 id='score'>".$a["score"]."</h2>
</div>";
}
    
    } 
    ?>
        </div>
    </div>
    <script src="script.js"></script>
</body>
</html>