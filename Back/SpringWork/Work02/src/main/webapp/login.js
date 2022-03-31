
(function(){
    function loadEvent(){
        let id = document.getElementById('id');
        id.focus();
    }
    window.addEventListener('load', loadEvent);
})();

function loginClick() {
    let id = document.getElementById('id').value;
    let pw = document.getElementById('pw').value;
    console.log(id)
    console.log(pw)
    if (id == ""){
        alert("아이디를 입력해주세요.")
        document.getElementById("id").focus();
    }else if (pw == ""){
        alert("패스워드를 입력해주세요.")
        document.getElementById("pw").focus();
    }else{
        document.getElementById('id').value = null;
        document.getElementById('pw').value = null;
    }
};

