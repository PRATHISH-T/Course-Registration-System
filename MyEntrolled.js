function  showEntrolledStudents(){
    fetch("http://localhost:8080/courses/entrolled")
    .then((request)=>request.json())
    .then(data=>{
        const EntrolledTable = document.getElementById("Entrolled")
        data.forEach(element => {
            const row = `
            <tr>
                <td>${element.id}</td>
                <td>${element.name}</td> 
                <td>${element.emailId}</td> 
                <td>${element.courseName}</td> 
            </tr>`;
            EntrolledTable.innerHTML += row;
        });
    })
    
}


   

