const quizDB = [
    {
        question: "Q1.Javascript Supports....?",
        a: "Functions",
        b: "XHTML",
        c: "CSS",
        d: "HTML",
        ans: "ans1"

        
    },
    {
        question: "Q2.Which language is used for styling web pages?",
        a: "HTML",
        b: "JQuery",
        c: "XML",
        d: "CSS",
        ans: "ans4"
    
    },
    {
        question: "Q3.Which is not a JS framework..?",
        a: "Python Script",
        b: "Django",
        c: "JQuery",
        d: "NodeJS",
        ans: "ans2"
    },
    {
        question: "Q4.Which is used for Connect To Database.?",
        a: "HTML",
        b: "JS",
        c: "PHP",
        d: "ALL",
        ans: "ans3"
    },
    {
        question: "Q5.JavaScript is a....?",
        a: "Language",
        b: "Development",
        c: "Programming Language",
        d: "ALL",
        ans: "ans3"
    },
    {
        question: "Q6.HTML Stands for...?",
        a: "Hello To My Lord",
        b: "Hey Text Mark Up Language",
        c: "HyperText Make Up Language",
        d: "HyperText Mark Up Language",
        ans: "ans4"
    }
    
    ];

    const question = document.querySelector('.question');
    const option1 = document.querySelector('#option1');
    const option2 = document.querySelector('#option2');
    const option3 = document.querySelector('#option3');
    const option4 = document.querySelector('#option4');
    const submit = document.querySelector('#Submit');

    const answers = document.querySelectorAll('.answer');
    const showScore = document.querySelector('#showScore')

    let questionCount = 0 ;
    let score = 0;

    const loadQuestion = () => {
        const questionList = quizDB[questionCount];
        question.innerText = questionList.question;

        option1.innerText = questionList.a;
        option2.innerText = questionList.b;
        option3.innerText = questionList.c;
        option4.innerText = questionList.d;


    }

    loadQuestion();

    const getCheckAnswer = () => {
        let answer;
        answers.forEach((curAnsElement) => {
            if(curAnsElement.checked){
                answer = curAnsElement.id;
            }
        })
        return answer;
    };

    const deselectAll = () =>{
        answers.forEach((curAnsElement) => curAnsElement.checked = false );
    }

    submit.addEventListener('click', () => {
        const checkedAnswer = getCheckAnswer();
        console.log(checkedAnswer);

        if(checkedAnswer === quizDB[questionCount].ans){
            score ++;
        }
        
        questionCount++;
        deselectAll();
        

        if(questionCount < quizDB.length){
            loadQuestion();
        }else{
            let percentage = (score / quizDB.length) * 100;
            showScore.innerHTML = `
                <h3> You Scored ${score}/${quizDB.length} which is ${percentage} %  </h3>
                <button class = "btn" onclick="location.reload()">Play Again... </button>
            `;

            showScore.classList.remove('scoreArea');
        }
    
    });

    