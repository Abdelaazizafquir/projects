const divaside=document.querySelector(".divaside");
const article=document.querySelector(".article");
const total=document.querySelector('.total');
const xmlhttp =new XMLHttpRequest();

let tot=0;
xmlhttp.open("GET","datastore.php");
xmlhttp.onload = function() {
    
    let products = JSON.parse(this.responseText);
    function insertarticle(products){
        let str='';
        products.forEach(element => {
            str+=`  <form action="" method="GET">
            <div class="art" id="'${element.id}'" name="addbut" value="${element.id}">
            <img src="imgs/${element.id}.png" alt="">
            <div class="prod">${element.name}</div>
            <i class="plus"><img src="imgs/plus.png"  id="${element.id}" alt="">
            </i>
                <div class="price">price:${element.price}</div>
              </div>
        </form>`
        });
        article.innerHTML=str;
        let add=document.querySelectorAll('.plus');
        add.forEach(ele=>{ele.addEventListener("click",addpant)});
    }
    insertarticle(products);

    function addpant(e){
        let y='';
        let i=0;
        products.forEach(ele=>{
            if(e.target.id==ele.id && ele.qtt==0){
                ele.qtt++;
                i=1;
                y=`<div class="divas" id="${ele.id}">
                <img src="imgs/${ele.id}.png" alt="">
                <div class="prodaside">${ele.name}  <div class="quant"> ${ele.qtt}</div></div>
                <i class="del"><img src="imgs/del.png"  id="${ele.id}" alt=""></i>
            </div>`;
            tot+=ele.price*ele.qtt;
            total.innerHTML=tot;
            divaside.innerHTML+=y;
            const del=document.querySelectorAll(".del");
            del.forEach(de=>de.addEventListener("click",delprod));
            }
            else if(e.target.id==ele.id && ele.qtt!=0){
                const divas=document.querySelectorAll('.divas');
                // console.log(divas);
                divas.forEach(elem=>{
                    console.log(elem.id);
                    if(elem.id==e.target.id){
                        let q=ele.qtt;
                        ele.qtt++;
                        let to=elem.querySelector(".quant");
                        to.innerHTML=ele.qtt;
                        console.log(ele.qtt);
                        tot+=(ele.qtt-q)*ele.price;
                        total.innerHTML=tot;
                    }
                
                })
            }
        })
        
        
    }

    function delprod(e){
        const divas=document.querySelectorAll('.divas');
        divas.forEach(ele=>{
            if(ele.id==e.target.id){
                ele.parentElement.removeChild(ele);
                products.forEach(elem=>{
                    if(elem.id==ele.id){
                        let p=elem.price*elem.qtt;
                        console.log(p);
                        elem.qtt=0;
                        tot=tot-p;
                        total.innerHTML=tot;
                    }
                })
            }
        })
    }
}


xmlhttp.send();