<template>
  <div>
      <table>
      <h3>TodoList</h3>
      <todoForm></todoForm>
      <thead>
      <tr></tr>
      </thead>
      <tbody>
          <TodoListItem v-for = "todo in todoList" :key="todo.id"></TodoListItem>
      </tbody>
      </table>
  </div>
</template>

<script>
import TodoForm from './TodoForm.vue'
import TodoList from './TodoList.vue'

const todos = [];
for(let i = 0; i < 5 ;i ++){
    const todo = {id : i , text: `${i}번째 할 일`, done: false};
    todos.push(todo);
}

export default {
    components: { TodoFrom, TodoList},
    data: function(){
        return {
            todoList: todos
        }
    }
}
</script>

<style>

</style>