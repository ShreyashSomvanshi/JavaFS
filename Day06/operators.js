const a = [1,2,3];
const b = [5,6,7];
const c = a.concat(b);

console.log("Concat array: ", c);

const d = [a,b];
console.log(d);

const e = [...a, ...b];

// rest operator
function demo(...p){
    // let a1 = Array.from(b);
    // let a2 = a1.map(x=>x*2);
    let a2 = p.map(x=>x*2);
    console.log(a2);
}

// demo(1,2);
demo(2,3,2);

// let x1 = {ename: "Rainy"},
// x2 = {ename: "Sunny"},
// x3 = {ename: "cloudy"}
// let weather = new Map(['drops', 'Hot', 'Cold'],['raincoat','gumboot']);
// console.log(weather);

let arr = [3,4,5,6];
for (let i =0; i<arr.length;i++){
    arr[i] = arr[i]*2;
}


let m = arr.map(function(element){
    return element*2;
})

console.log(arr);

let Emp = [{fname:"suman", lname:"kale"},
     {fname:"rajat", lname: "pradhan"},
     {fname:"bhushan", lname: "sharma"}
];

let emp1 = Emp.map(function(element){
    return `${element.fname} ${element.lname}`;
})

console.log(emp1);

// function itr(value,key,map){
//     console.log(`m[${key}]=${value}`);
// }

// new Map([['a', 10], ['b', 12], ['x', '13']]).foreach(itr);

// function itr(value ,key,map){
//     console.log(`m[${key}] = ${value}`);
// }

// new Map ([['a', 10],['b' , 12],['x' , '13'],]).foreach(itr);

function itr(value, key, map){
    console.log(`m[${key}]=${value}`);
}


new Map([['a', 10], ['b', 12], ['x', '13']]).forEach(itr)


//set
let s = new Set([1,2,2,'3',3,4,4]);
console.log(s, typeof(s));

s.add(88)
console.log(s);

s.delete(4)
console.log(s);

console.log('check if 2 is in set:', s.has(2));

for (let p of s){
    console.log(p);
    
}

console.log('size of set is:', s.size);