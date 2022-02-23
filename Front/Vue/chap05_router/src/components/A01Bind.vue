<template>
    <div>
        <h3>A01 Binding</h3>

        <div>
            <h5>1. 일반적 바인딩</h5>
            일반적인 단방향 바인딩: {{name}}<br>
            함수의 리턴값: {{onAdd(10, 20)}}<br>
            함수의 리턴값: {{onMin(10, 20) / 2}}<br>
            배열: {{fruit[0]}} / {{fruit[1]}} / {{fruit[10]}}<br>
            객체: {{user.name}} / {{user.age}} / {{user.address}}<br>
        </div>
        <br>

        <div>
            <h5>2. 바인딩 연산</h5>
            일반적 연산: {{1 + 2}}<br>
            속성 참조: {{fruit.length}} <br>
            속성 참조 연산: {{fruit.length * 100}} <br>
            비교 연산: {{fruit.length > 4}}<br>
            비교 연산: {{name === 'NolBu'}}<br>
            삼항 연산: {{name === 'NolBu' ? '놀부' : '게스트'}}<br>
        </div>
        <br>

        <div>
            <h5>3. 바인딩 관련 지시자</h5>
            v-text: <span v-text="txt"></span><br>
            v-html: <span v-html="txt"></span><br>
            v-once: <span v-once>{{txt}}</span><br>
            v-pre: <span v-pre>{{txt}}</span><br>
            <br>
            <button v-on:click="changeTxt('Good Morning')">Change</button>
            <button @click="changeTxt('Good Afternoon')">Change</button>
            <br>
        </div>

        <div>
            <!-- Data에 존재하지 않는 변수: {{age}}<br> -->
            <!-- Data에 존재하지 않는 객체: {{person?.name}} -->
        </div>
        <br>
    </div>
</template>

<script>
export default {

    data() {
        return {
            title: 'A01 Binding',
            name: 'NolBu',
            fruit: ['apple', 'banana', 'orange'],
            user: {name: 'HungBu', age: 20},
            txt: '<b>Hello World</b>',
            person: null,
        }
    },
    methods: {
        onAdd: function(x, y) {
            return `${x} + ${y} = ${x + y}`;
        },
        onMin: function(x, y) {
            return `${x} - ${y} = ${x - y}`;
        },
        changeTxt: function(txt) {
            this.txt = `<b>${txt}</b>`;
            this.person = {name: 'Kim'}
        }
    }
}
</script>

<style scoped>
    
</style>