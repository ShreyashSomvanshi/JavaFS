class EmployeeManagement{
    constructor(){
        this.employees = [];
    }
    addEmp(emp){
        this.employees.push(emp);
        // alert("Added");
        document.getElementById("dispAdd").innerHTML = `Employee: ${emp.name} with ID: ${emp.id} added successfully.`;
    };
}

const objEMS = new EmployeeManagement();

const name = document.getElementById("name").value;
const id = document.getElementById("id").value;
const skill = document.getElementById("skill").value;
const department = document.getElementById("department").value;
const doj = document.getElementById("date").value;
objEMS.addEmp({ name, id, skill, department, doj });

      