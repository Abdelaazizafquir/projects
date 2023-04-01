<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="public/style/styleadd.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    <title>add article</title>
</head>
<body>
<a href="index.php"><i class="fa-solid fa-house" id="logicon"></i></a>
  <?php
  session_start();
  function con(){
  try{ $db = new PDO('mysql:host=localhost;dbname=gidb', 'root', '');
    $req = $db->prepare('select * from article');
    $req->execute();
    $res=$req->fetchAll();
    return $res;
 }catch(PDOException $e){
    echo $e->getMessage();
 }
}
  $res = con();
  if(isset($_GET["id"])){
    $_SESSION["id"]=$_GET["id"];
    foreach($res as $value){
      if($value["id"]==$_GET["id"]){
        $_SESSION["id"]=$_GET["id"];
        echo '<h1 class="title">add article</h1>
        <form method="get">
         <div>Nom author:</div>
         <input type="text" name="nom" value='.$value["author"].' readonly>
         <div>subject</div>
         <input type="text" name="subject" value='.$value["title"].' >
         <div>object :</div>
         <input type="text" name="main" value='.$value["title"].'>
         <div>content :</div>
         <textarea name="content" id="" cols="90" rows="15">'.$value["content"].'</textarea>
         <input type="submit" value="edit" name="ed">
        </form> ';
         }
    }
  
  }
  else {
    echo ' <h1 class="title">add article</h1>
    <form method="get">
     <div>Nom author:</div>
     <input type="text" name="nom">
     <div>subject</div>
     <input type="text" name="subject">
     <div>object :</div>
     <input type="text" name="main" >
     <div>content :</div>
     <textarea name="content" id="" cols="90" rows="15"></textarea>
     <input type="submit" value="add" name="sb">
    </form> ';
  }
  ?>
   
   <?php
 
     if(isset($_GET["sb"])){
      try {
        $db = new PDO('mysql:host=localhost;dbname=gidb', 'root', '');
        $sql = 'INSERT INTO article(author,title,content,date) VALUES (:u, :p,:c,:d)';
        $req = $db->prepare($sql);
        $req->execute(['u'=>$_GET["nom"],'p'=>$_GET["main"],'c'=>$_GET["content"],'d'=>date("d/m/y")]);
        echo "<div>add successfully <br> <a href='index.php' class='link'>back to articles</a></div>";
        }catch(PDOException $e){
        echo $e->getMessage();
        }
    
   }
  //  else if(isset($_GET["ed"])){
  //   foreach($array as $value){
  //     if($value["id"]==$_SESSION["id"]){
  //     $article=array("id"=>$_SESSION["id"],"user"=>$value["user"],"date"=>date("Y-m-d"),"subject"=>$_GET["subject"],"main"=>$_GET["main"],"content"=>$_GET["content"]);
  //       unset($array[$value["id"]]);
  //       array_push($array,$article);
  //   $f=fopen("article.json","w+");
  //   $encode=json_encode($array);
  //   fwrite($f,$encode);
  //   echo "<div>add successfully <br> <a href='index.php' class='link'>back to articles</a></div>";
  //     }
  //   }
  //  }
   ?>
</body>
</html>