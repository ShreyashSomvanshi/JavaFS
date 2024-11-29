// Async- function that returns promise
// await - keywd used to give delay till the execution of promise


const fetchButton = document.getElementById('fetch');
const userList = document.getElementById('userList')

async function name() {
    try{
        const response = await fetch('https://jsonplacehollder.typicode.com/users');
    if(!response.ok){
        throw new Error('Failed to fetch data');
    }
    //parsing response
    const users = await response.json();

    userList.innerHTML='';
    users.forEach(user=>{
        const li = document.createElement('li');
        li.textContent=`${user.name} - ${user.email}`;
        userList.appendChild(li);
    })
    
    }
    catch(error){
        userList.innerHTML`<li> Error: ${error.message}</li>`
    }
}
