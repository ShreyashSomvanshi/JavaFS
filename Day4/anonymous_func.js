let x = function(){
    console.log("It'll not run.");
    
}


x();

function welcome(wish){
    console.log(wish(), "everyone");
    
}

welcome(function(){
    return "Good morning all."
})

setTimeout(function(){
    console.log("Hello World");
    
}, 5000);


// IIFE: Immediate Invoke Function Expression
(function(p){
    // alert(p);
    console.log(p);
})('Hi Everyone');

// Arrow func:

// const welcome1 = () => "hiiiiii arrow";
// welcome1();

//regular func
let m1 = function(n1, n2){
    return n1 * n2;
}

let m2 = (n1, n2) => {return n1, n2};

const w =(name='Robot') => `Hello, ${name}`;
console.log(w('John'));
console.log(w());

// Arrow func with this
const group = {
    member: ['Abc', 'Xyz'],
    groupName: 'India',
    groupMsg:function(){
        this.member.forEach((mem)=>{
            console.log(`${mem} is in the Group ${this.groupName}`);
        })
    }
}

group.groupMsg(); // Lexically bin 'this' to group pbj conntext





