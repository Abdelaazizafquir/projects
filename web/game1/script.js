const jeux=document.querySelector(".jeux");
const roll=document.querySelector(".roll");
const save=document.querySelector(".save");
const quite=document.querySelector(".quite");
const score=document.querySelector(".score");
const total=document.querySelector(".total");
let totl=0;
let savee=0;
let to=0;
let toe=0;
function change(){
    let randomdic=Math.floor(Math.random()*7);
    rend=randomdic;
    score.textContent=randomdic;
    let diceim="public/imgd/"+"dice-"+randomdic+".png";
    let img2=document.querySelector("#images");
    img2.setAttribute("src",diceim);
    if(randomdic==1){
        totl=0;
        savee=0;
        total.textContent=0;
        score.textContent=0;
    }
    else{
        totl=totl+ +randomdic;
        score.textContent=totl;
    }

}

function saves(){
savee++;
to=Math.floor(totl/savee);
toe=total.textContent;
toe=(+toe)+ (+to);
total.textContent=toe;
}

function dataa(){
    let xhr;
       xhr = new XMLHttpRequest();
       
        xhr.open("GET", "save.php?score="+toe,false);                  
        xhr.send();
        xhr.onreadystatechange = display_data;
	function display_data() {
	 if (xhr.readyState == 4){
     if(xhr.status == 200){
      
      } else {
        alert('There was a problem with the request.');
      }
     
     }}
 
  };
  
  function senddata(){
    dataa();
    window.location.href = "index.php";
}

save.addEventListener("click",saves);
roll.addEventListener("click",change);
quite.addEventListener("click",senddata);