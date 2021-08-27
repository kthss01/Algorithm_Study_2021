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
    card_header : document.querySelector('#problem_template .card-header'),
};

function compute({name, category, content, limit, example, link, reference, check, solution, id}) {
    
    // navigation 처리
    nav_item_a.setAttribute('href', `#${id}`);
    nav_item_a.textContent = name;    
    
    const new_nav_item = nav_item.cloneNode(true);
    new_nav_item.removeAttribute('id');
    new_nav_item.classList.remove('d-none');
    
    nav_ul.appendChild(new_nav_item);
    
    // problem 처리
    prob.name.textContent = name;
    prob.category.textContent = category;
    // 처음 \n 제거
    content = content.replace(/\n/, "");
    // 나머지 \n <br>로 전환
    prob.content.innerHTML = content.replace(/\n/g, "<br>");
    // 처음 \n 제거
    limit = limit.replace(/\n/, "");
    // 나머지 \n <br>로 전환
    prob.limit.innerHTML = limit.replace(/\n/g, "<br>");
    prob.link.setAttribute('href', link);
    reference = reference.replace(/\n/, "");
    prob.reference.innerHTML = reference.replace(/\n/g, "<br>");

    prob.card_header.classList.remove('bg-info', 'bg-success', 'bg-danger');
    check ? prob.card_header.classList.add('bg-success') : prob.card_header.classList.add('bg-danger');
    
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
    parameter.forEach((param, index) => {
        const tbody_tr = document.createElement('tr');

        let tbody_td;
        // parameter 추가
        param.forEach(p => {
            tbody_td = document.createElement('td');
            let text = '';
            if (Array.isArray(p)) {
                text += '[';
                if (Array.isArray(p[0])) {
                    p.forEach(p2 => {
                        text += '[';
                        text += p2.join(',');
                        text += ']';
                    })
                } else {
                    text += p.join(',');
                }
                text += ']';
            } else {
                text = p;
            }

            tbody_td.textContent = text;
            tbody_tr.appendChild(tbody_td);
        });

        // answer 추가
        tbody_td = document.createElement('td');

        let text = '';
        if (Array.isArray(answer[index])) {
            text += '[';
            answer[index].forEach(e => {
                text += '[';
                text += e.join(',');
                text += ']';
            })
            text += ']';
        } else {
            text = answer[index];
        }

        tbody_td.textContent = text;
        tbody_tr.appendChild(tbody_td);

        // solution 추가
        tbody_td = document.createElement('td');

        text = '';
        if (Array.isArray(solution(...param))) {
            text += '[';
            solution(...param).forEach(e => {
                text += '[';
                text += e.join(',');
                text += ']';
            })
            text += ']';
        } else {
            text = solution(...param);
        }

        tbody_td.textContent = text;
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