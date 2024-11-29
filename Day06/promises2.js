let win = true ; // reject if false

function getUsers(){
  return new Promise((resolve , reject )=>{
    setTimeout(()=>{ 
        if(win){
        resolve([{name: 'John', age: 25},
        {name: 'Jane', age: 30},
        {name: 'Bob', age: 35} 
    ]); 
}else{
        reject('Error');}
    }, 1000);
  });
}

function fullfill(users){
    console.log(users);
}

function reject(error){
    console.log(error);
}
const prom = getUsers();
prom.then(fullfill , reject);

prom.catch(fullfill, reject)


  
        
  
 