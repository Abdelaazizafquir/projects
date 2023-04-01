const balle=document.querySelector(".balle");
const blanch=document.querySelector(".blanch");
const jeux=document.querySelector(".jeux");
const plaque=document.querySelector(".blanch");
const score=document.querySelector("#score");
const save=document.querySelector(".save");
let height=0;
let v=1;
function moveballe(){
    if(v==1){
        let i=Math.floor(Math.random()*550);
        balle.style.left=i+"px";
    }
    if(height<540){
            height=height+10;
            balle.style.top=(height)+"px";
         v=0;
    }
    if(height>=540){
            height=0;
            v=1;
        }
    

    
}
let right=0;
function moveblanch(e){
        switch (e.key) {
          case 'ArrowLeft':
            if(right<500){
          
            right-=20;
            break;
          }
          case 'ArrowRight':
            if(right<500){
              right+=20;
            break;}
      
        }
        plaque.style.left=right+"px";
      }
    function isOverlap() {
        const domRect1 = balle.getBoundingClientRect();
        const domRect2 = blanch.getBoundingClientRect();
      
        return !(
          domRect1.top > domRect2.bottom ||
          domRect1.right < domRect2.left ||
          domRect1.bottom < domRect2.top ||
          domRect1.left > domRect2.right
        );
      }

      let sc=0;
function addscore(){
  console.log("sc"+sc);
  if(isOverlap()==true){
    sc++;
    score.innerHTML=sc;
  }
}

function sendscore(){
  let scr=score.textContent;
  let xhr=new XMLHttpRequest();
  xhr.open("GET", "save.php?score="+scr,false);                  
        xhr.send();
  xhr.onreadystatechange = display_data;
	function display_data() {
	 if (xhr.readyState == 4){
     if(xhr.status == 200){
      
      } else {
        alert('There was a problem with the request.');
      }
     
     }}

}
function send(){
  // sendscore();
    window.location.href = "save.php?score="+sc;
}
setInterval(addscore,300);
setInterval(moveballe,50);
window.addEventListener('keydown',moveblanch);
save.addEventListener('click',send);
