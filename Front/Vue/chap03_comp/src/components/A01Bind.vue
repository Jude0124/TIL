<template>
     <div class="card-body" id="app">
        <h3>{{title}}</h3>

        <div>
            <h5>1. 일반적 바인딩</h5>
            일반적인 단방향 바인딩: {{10 + 20}}<br>
            함수의 리턴값: {{onAdd(10, 20)}}<br>
            함수의 리턴값: {{onAdd(20, 20)}}<br>
            배열: {{arr[0]}} / {{arr[1]}} / {{arr[5]}}<br>
            객체: {{obj.name}} / {{obj.age}} / {{obj.address}}<br>
        </div>
        <br>

        <div>
            <h5>2. 바인딩 연산</h5>
            일반적 연산: {{ 10 * 20 }}<br>
            속성 참조: {{ person.fruit.length }}<br>
            속성 참조 연산: {{ person.fruit.length * 100 }}<br>
            비교 연산: {{ person.fruit.length > 3 }}<br>
            비교 연산: {{ person.fruit.length === 2 && person.fruit[0] === 'Apple' }}<br>
            삼항 연산: {{ person.name === 'NolBu' ? '놀부' : '누군지 모름'}}<br>
        </div>
        <br>

        <div>
            <h5>3. 바인딩 관련 지시자</h5>
            Vue에서 제공하는 지시자는 설정한 값이 data, methods, computed에서 참조<br>
            즉 변수명, 함수명이 된다<br>

            v-text: <span v-text="txt"></span><br>
            v-html: <span v-html="txt"></span><br>

            최초 1번만 바인딩한다<br>
            v-once: <span v-once>{{txt}}</span><br>

            v-pre는 {{}}를 바인딩 식으로 표현하지 않고 일반 문자로 인식하도록 한다<br>
            v-pre: <span v-pre>{{txt}}</span><br>
            <br>
            <button v-on:click="changeTxt('NolBu')">Change</button>
            <button @click="changeTxt('HungBu')">Change</button>
            <br>
        </div>

        <div>
            Data에 존재하지 않는 변수: 
            Data에 존재하지 않는 객체: 
        </div>
        <br>
    </div>
</template>

<script>
export default {
    data: {
                title: 'A01 Binding',
                arr: [10, 11, 100],
                obj: {
                    name: '흥부',
                    age: 20
                },
                person: {
                    name: 'NolBu',
                    fruit: ['Apple', 'Banana', 'Lemon']
                },
                txt: '<b>Hello World</b>'
            },
            methods: {
                onAdd: function(x, y) {
                    return `${x} + ${y} = ${x + y}`
                },
                changeTxt: function(str) {
                    // data 존재하는 변수는 this(vue 객체)로 참조한다
                    this.txt = '<b>' + str + '</b>';
                }
            },
            computed: {}
    
}
</script>

<style scoped>

</style>