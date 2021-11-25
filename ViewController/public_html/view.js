 function mouseOverTableT2(evt){
        
       var  t1scroller = document.getElementById("t1::scroller") ;
       var  t2scroller = document.getElementById("t2::hscroller") ;
       t1scroller.scrollLeft = t2scroller.scrollLeft;
//     console.log('t1scroller.scrollLeft :' +t1scroller.scrollLeft);
//      console.log('t2scroller.scrollLeft :' +t2scroller.scrollLeft);
 
     }

function mouseOverTabletT1(evt){
               // t1.setProperty("scrollLeft",100);
       var  t1scroller = document.getElementById("t1::scroller") ;
       var  t2scroller = document.getElementById("t2::hscroller") ;

        t2scroller.scrollLeft = t1scroller.scrollLeft;
      
}