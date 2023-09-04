
//화살표 함수와 this의 관계
const dog = {
    name:'뽀삐',
    regularFn: function() {
        console.log('regular', this); //자기자신 객체
    },
    arrowFn:() => {
        console.log('arrow:',this); //window객체
    }
};

dog.regularFn();
dog.arrowFn();

console.log('================================');

const cat = {
    name: '나비',
    introduce: function () {
        console.log(`intro this:`, this);
        setTimeout(() => {
        console.log(`setTime:`, this);
        console.log(`안녕 제 이름은 ${this.name}이에요!`);
        }, 2000);
    }
};

cat.introduce();

$modal.addEventListener('click',function(e){
    console.log(this); //$modal
    $ok.addEventListener('click',function(e){
        console.log(this); //%ok
    });
    $cancel.addEventListener('click',function(e){
        console.log(this); //$modal
    });
});