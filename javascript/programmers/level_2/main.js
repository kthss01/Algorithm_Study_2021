const nav_ul = document.getElementById('nav_ul');

const nav_item = document.querySelector('#nav_item_template');
const nav_item_a = document.querySelector('#nav_item_template a');

const problem = document.getElementById('problem');

const problem_template = document.getElementById('problem_template');

const prob = {
    name : document.querySelector('#problem_template .card-header h4'),
    category : document.querySelector('#problem_template .card-header span'),
    content : document.querySelector('#problem_template .card-body p:first-child'),
    limit : document.querySelector('#problem_template .card-body p:nth-child(2)'),
    table_head : document.querySelector('#problem_template table thead'),
    table_body : document.querySelector('#problem_template table tbody'),
    link : document.querySelector('#problem_template .card-footer a'),
    reference : document.querySelector('#problem_template .card-footer p'),
};

function compute({name, category, content, limit, example, link, reference, id}) {
    
    // navigation 처리
    nav_item_a.setAttribute('href', `#${id}`);
    nav_item_a.textContent = name;    
    
    const new_nav_item = nav_item.cloneNode(true);
    new_nav_item.classList.remove('d-none');
    
    nav_ul.appendChild(new_nav_item);
    
    // problem 처리
    prob.name.textContent = name;
    prob.category.textContent = category;
    prob.content.textContent = content;
    prob.limit.textContent = limit;
    prob.link.setAttribute('href', link);
    prob.reference.textContent = reference;
    
    // problem table 처리
    const { header : table_head, body : table_body } = example;

    // table 비우기
    while (prob.table_head.hasChildNodes()) {
        prob.table_head.removeChild(prob.table_head.firstChild);
    }
    while (prob.table_body.hasChildNodes()) {
        prob.table_body.removeChild(prob.table_body.firstChild);
    }
    
    // thead
    const thead_tr = document.createElement('tr');
    table_head.forEach(ele => {
        const thead_td = document.createElement('th');
        thead_td.textContent = ele;
        thead_tr.appendChild(thead_td);
    });
    prob.table_head.appendChild(thead_tr);

    // tbody
    const {parameter, answer} = table_body;
    parameter.forEach((ele, index) => {
        const tbody_tr = document.createElement('tr');

        // parameter 추가
        ele.forEach(p => {
            const tbody_td = document.createElement('td');
            tbody_td.textContent = p;
            tbody_tr.appendChild(tbody_td);
        });

        // answer 추가
        const tbody_td = document.createElement('td');
        tbody_td.textContent = answer[index];
        tbody_tr.appendChild(tbody_td);

        prob.table_body.appendChild(tbody_tr);
    })

    // problem 복사
    const newProblem = problem_template.cloneNode(true);

    newProblem.classList.remove('d-none');
    newProblem.setAttribute('id', id);

    problem.appendChild(newProblem);
}

export default compute;