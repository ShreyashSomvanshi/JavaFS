/*
//syncronous method
function getData(){
    return [
        {name: 'John', age: 25},
        {name: 'Jane', age: 30},
        {name: 'Bob', age: 35}
    ];
}

function findData(u_name){
    const users = getData();
    const user = users.find(user => user.name == u_name);
    return user
}

console.log(findData('Bob'));
*/

/*
//Async 
function getUsers(callback){
    // let users = [];
    // users =
    setTimeout(()=>{
        callback([
            {name: 'John', age: 25},
            {name: 'Jane', age: 30},
            {name: 'Bob', age: 35}
        ]);
    }, 1000) 
    // return users;
}

function findUser(u_name, callback){
    // const users = getUsers();
    // const user = users.find(user => user.name === u_name);
    getUsers((users) => {
        const user = users.find((user) => user.name === u_name);
    callback(user);
});
}

console.log(findUser('Bob'));

*/


// Promises
// syntax: const promise = new Promise( (resolve, reject) => {})

let win = true;

function getUsers(){
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            if(win){
            resolve([
                {name: 'John', age: 25},
                {name: 'Jane', age: 30},
                {name: 'Bob', age: 35}
            ]);}
        else{
            reject('Error');
        }  }, 1000) ;
    });
    
}


function fulfill(users){
    console.log(users);
}

function reject(error){
    console.log(error);
}

const prom = getUsers();
prom.then(fulfill, reject);
