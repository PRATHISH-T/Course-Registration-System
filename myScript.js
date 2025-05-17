function showCourses() {
    fetch("http://localhost:8080/courses")
    .then(response => response.json()) 
    .then(data => {
        const dataTable = document.getElementById("courseTable");
        data.forEach(element => {
            const row = `
            <tr>
                <td>${element.courseId}</td>
                <td>${element.couseName}</td> 
                <td>${element.trainer}</td> 
                <td>${element.durationInWeeks}</td> 
            </tr>`;
            dataTable.innerHTML += row;
        });
    })
}
