console.log("read external script file");

function calculateNums(){
    
   var a = parseInt(document.getElementById("num1").value);
   var b = parseInt(document.getElementById("num2").value);
   var c = document.getElementById("mathOperation").value;
   //var result = document.getElementById("result").value;
  
  if(c == "add"){
    result = parseFloat(a)+parseFloat(b);
    document.getElementById("result").value = result;
  }
   else if (c=="sub") {
       result = parseFloat(a)-parseFloat(b);
    document.getElementById("result").value = result;   
   }
    
   else if (c=="mul") {
       result = parseFloat(a)*parseFloat(b);
    document.getElementById("result").value = result;   
   } 
    else{
      result = parseFloat(a)/parseFloat(b);
    document.getElementById("result").value = result;     
    }
}