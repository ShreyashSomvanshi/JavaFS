// document.getElementById("date").innerHTML = "Date"+ Date();

// document.write(Date());

// let myClass = document.getElementsByClassName("T");
// alert("we are accessing element via class name: "+myClass[0].innerHTML);

// ======================

document.write(Date());

const table = document.getElementById("table");
const tableAttrs = table.attributes;

for(let i=0; i<tableAttrs.length;i++)
{
    if(tableAttrs[i].nodeName.toLowerCase()==="border"){
        table.border = "1";
    }
}

table.summary="note: increased border";


