class EmployeeManagement{
    constructor(){
        this.employees = [];
    }
    addEmp(emp){
        this.employees.push(emp);
        document.getElementById("dispAdd").innerHTML=`Employee with ID: ${emp.id} added successfully.`;
    };

    searchEmply(id) {
        const emp = this.employees.find(emp => emp.id === id);
        if (emp) {
          document.getElementById("dispSearch").innerHTML=`
            Name: ${emp.name}<br>
            ID: ${emp.id}<br>
            Skill: ${emp.skill}<br>
            Department: ${emp.department}<br>
            Date Of Joining: ${emp.doj}`;
        } else {
          alert(`Employee with ID: ${id} not found.`);
        }
      }

    rmvEmp(id) {
        const index = this.employees.findIndex(emp => emp.id === id);
        if (index !== -1) {
          this.employees.splice(index, 1);
          document.getElementById('dispRemove').innerHTML=`Employee with ID: ${id} removed successfully.`;
        } else {
          document.getElementById('dispRemove').innerHTML=`Employee with ID: ${id} not found.`;
        }
      }
      
}

const objEMS = new EmployeeManagement();


function addEmp(){
    const name = document.getElementById("name").value;
    const id = document.getElementById("id").value;
    const skill = document.getElementById("skill").value;
    const department = document.getElementById("department").value;
    const doj = document.getElementById("date").value;
    if (id && name && skill && department && doj) {
        objEMS.addEmp({ name, id, skill, department, doj });
      } else {
        alert("Please enter all the details to add record.");
      }
    
}

function searchEmply() {
    const id = document.getElementById("searchId").value;
    if (id) {
      objEMS.searchEmply(id);
    } else {
      alert("Please enter the Employee ID to search.");
    }
  }



function rmvEmp() {
    const id = document.getElementById("removeId").value;
    if (id) {
      objEMS.rmvEmp(id);
    } else {
      alert("Please enter the Employee ID to remove.");
    }
  }