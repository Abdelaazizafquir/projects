<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link rel="stylesheet" href="public/style/stylearticle.css">
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    <title>Article</title>
</head>
<body>
    <header class="header">
    <div class="title">Les articles</div>
    <form method="get">
    <?php 
     session_start();
     if(isset($_SESSION["username"])){
    echo '<input type="submit" name="logout" value="log out" id="logouticon">';
}
if(isset($_SESSION["admin"])){
    echo '<input type="submit" name="logout" value="log out" id="logouticon">';
    echo '<a href="users.php"><i class="fa-solid fa-users" id="users"></i></a>';
}
  ?>

    </form>

  <?php 

   if(isset($_GET["logout"]) && isset($_SESSION["username"])){
    unset($_SESSION['username']);
    header("location:index.php");
}else if(isset($_GET["logout"]) && isset($_SESSION["admin"])){
    unset($_SESSION['admin']);
    header("location:index.php");
}
  ?>

    <?php 
     if(!isset($_SESSION["username"])){
        echo '    <a href="login.php"><i class="fa-solid fa-right-to-bracket" id="houseicon"></i></a>';
    }
    ?>
   <a href="index.php"><i class="fa-solid fa-house" id="logicon"></i></a>
   <a href="addarticle.php"><i class="fa-solid fa-square-plus" id="addicon"></i></a> 
    </header> 

    <div class="container">
    <?php 
 function con(){
       try{ $db = new PDO('mysql:host=localhost;dbname=gidb', 'root', '');
        $req = $db->prepare('select * from article');
        $req->execute();
        $res = $req->fetchAll();
        return $res;
     }catch(PDOException $e){
        echo $e->getMessage();
     }
    }
    $rese = con();
    if(isset($_SESSION["admin"])){
        foreach($rese as $value){
            echo "
            <div class='article'>
            <div class='info'> 
               <div class='nom'>article :".$value["title"]."</div>
              <div class='author'>author :".$value["author"]."</div>
              <div class='date'>date creation :".$value["date"]."</div>
              <div class='resume'>resume :".$value["title"]."</div>
              <div class='icon'>
              <a href='addarticle.php?id=".$value["id"]."'><i class='fa-solid fa-pen-to-square'></i></a>
              <a href='sup.php?id=".$value["id"]."'><i class='fa-solid fa-trash'></i> </div></a>
              <div class='content'>".$value["content"]."</div>
              <div class='reating'><a href='reating.php?id=".$value["id"]."'><i class='fa-solid fa-star'></i></a></div>
                </div>
                </div>
            ";
    }
    }
    else if(isset($_SESSION["username"])){
        foreach($rese as $value){
            // if($value["author"]==$_SESSION["username"]){
            echo "
            <div class='article'>
            <div class='info'> 
               <div class='nom'>article :".$value["title"]."</div>
              <div class='author'>author :".$value["author"]."</div>
              <div class='date'>date creation :".$value["date"]."</div>
              <div class='resume'>resume :".$value["title"]."</div>
              <div class='icon'>
              <a href='addarticle.php?id=".$value["id"]."'><i class='fa-solid fa-pen-to-square'></i></a>
              <a href='sup.php?id=".$value["id"]."'><i class='fa-solid fa-trash'></i> </div></a>
              <div class='content'>".$value["content"]."</div>
              <div class='reating'><i class='fa-solid fa-star'></i></div>
                </div>
                </div>
            ";
        // }
    }
    }
    else{
        foreach($rese as $value){
            echo "
            <div class='article'>
            <div class='info'> 
               <div class='nom'>article :".$value["title"]."</div>
              <div class='author'>author :".$value["author"]."</div>
              <div class='date'>date creation :".$value["date"]."</div>
              <div class='resume'>resume :".$value["title"]."</div>
              <div class='content'>".$value["content"]."</div>
              <div class='reating'><a href='reating.php?id=".$value["id"]."'><i class='fa-solid fa-star'></i></a></div>
                </div></div>
            ";
        }

    }

       

    
    ?>

<!--    
    <div class="article">
  <div class="info"> 
     <div class="nom">article :</div>
    <div class="author">author :</div>
    <div class="date">date creation :</div>
    <div class="resume">resume :</div>
    <div class="icon">
    <i class="fa-solid fa-pen-to-square"></i>
    <i class="fa-solid fa-trash"></i>
    </div>
</div>
    <div class="content">Lorem ipsum dolor sit amet consectetur adipisicing elit. Reiciendis minima animi fugit doloremque nam consequatur magnam earum aut omnis, officiis, quis unde in soluta temporibus pariatur nulla voluptatem autem praesentium?</div>
    </div> -->

    </div>
</body>
</html>