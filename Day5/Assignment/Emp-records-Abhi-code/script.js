let empId = []
 
let empInfo = []
 
let btn = document.getElementById("submit-btn");
 
btn.addEventListener("click", ()=>{
 
    const row = document.getElementById("input-row");
 
    const inp = row.querySelectorAll("input");
    let n = inp[0].value;
    let id = inp[1].value;
    let s = inp[2].value;
    let d = inp[3].value;
    let dep = inp[4].value;
 
    empInfo.push({name:n,empId :id ,skill:s, doj:d, department:dep});
    // empId.push(empInfo.length);
    alert(`Employee ${n} is added successfully`);
    updateEmplView();
});
 
function updateEmplView(){
    const res = document.getElementById("res");
    let result = document.createElement("div")
 
   
    empInfo.forEach(ele =>{
        result.innerHTML = `<div>
        <b>name: ${ele.name},  id: ${ele.empId}, skill: ${ele.skill}, doj: ${ele.doj}, department : ${ele.department}<b>
        </div>`
        res.appendChild(result);
    })
}