<template>
    <div v-cloak>    <!-- 일시적 {{}} 숨김 -->
        <h3>A09 Style Binding</h3>

        <div style="color: orange; font-size: 24pt;">{{hello}}</div>
        <div v-bind:style="{color: 'orange', 'font-size': '24pt'}">{{hello}}</div> <!-- 문자로 묶거나 fontSize와 같은 카멜 표기법 이용 -->
        <div v-bind:style="{color: 'orange', 'fontSize': '24pt'}">{{hello}}</div>
        <div v-bind:style="[styleOne, styleTwo]" @mouseenter="enterEvent" @mouseleave="leaveEvent">{{hello}}</div>
        <br>

        <h3>Class Binding</h3>

        <div class="one">{{hello}}</div>
        <div class="one" v-bind:class="classTwo">{{hello}}</div>
        <div class="one" v-bind:class="[classTwo, 'three']">{{hello}}</div>
        <br>

        <!-- 일반 클래스만 적용된다 [변수 지정 안됨] -->
        <div class="one" v-bind:class="{two: true, three: isChecked}">{{hello}}</div>
        <div class="one" v-bind:class="[classTwo, {three: isChecked}]">{{hello}}</div>
        <input type="checkbox" v-model="isChecked"> Check<br />
        <br>

        <input type="text" class="form-control" v-model="num" v-bind:class="info" />
    </div>
</template>

<style scoped>

</style>

<script>
export default {
    data: function(){
        return {
            hello: 'Hello World!!',
            styleOne: { color: 'orange', backgroundColor: 'lightgray'},
            classTwo: 'two',
            isChecked: true,
            num: 10,
        }
    },
    computed: {
        styleTwo: function(){
            return { padding: '5px', fontSize: '18px' }
        },
        info: function() {
            if(this.num >= 1 && this.num <= 100) return { warning: false}
            else return {warning: true}
        }
    },
    methods: {
        enterEvent: function() {
            this.styleOne.color = 'white';
            this.styleOne.backgroundColor = 'black'
        },
        leaveEvent: function() {
            this.styleOne.color = 'orange';
            this.styleOne.backgroundColor = 'lightgray'
        }
    }
}
</script>

<style scoped>
    .one { color: orange; }
    .two { font-size: 24pt; }
    .three { font-weight: bold; }
    .warning {background-color: orange; color: gray; }

    [v-cloak] { display: none; }
</style>