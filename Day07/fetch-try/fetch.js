//async function : function that return Promise . inside an async you can use await to pause 
// execution of the function until the promise is resolved
const fetcButton = document.getElementById('fetchButton');
const userList = document.getElementById('userList');


async function fetchUserdata() {
    try{
        //start fetching data from API 
        const response = await fetch('https://jsonplaceholder.typicode.com/todos/');
        //check if the response is okay
        if(!response.ok){
            throw new Error('Failed to fetch data');
        }
        //parsing the response 
        const users = await response.json();
        // console.log(users);
        // console.log(response.json());

        userList.innerHTML='';
        users.forEach(user => { 
            const li = document.createElement('li');
            li.textContent =`title: ${user.title} -`;
            userList.appendChild(li);
        });
        
    }catch(error){
        userList.innerHTML=`<li> Error :${error.message}<\li>`
    }
}
fetcButton.addEventListener('click' , fetchUserdata);
