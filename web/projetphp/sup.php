<?php 
  try{ $db = new PDO('mysql:host=localhost;dbname=gidb', 'root', '');
    $req = $db->prepare('delete from article where id='.$_GET["id"].'');
    $req->execute();
    header('location:index.php');
 }catch(PDOException $e){
    echo $e->getMessage();
 }
    // $data=file_get_contents('article.json');
    // $array=json_decode($data,true);
    // foreach($array as $value){
    //     if($value["id"]==$_GET["id"]){
    //         echo $_GET["id"];
    //         unset($array[$value["id"]]);
    //         $f=fopen("article.json","w+");
    //          $encode=json_encode($array);
    //         fwrite($f,$encode);
    //         header('location:index.php');
    //         exit;
    //     }
    // }

?>