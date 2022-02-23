<template>
  <div>
    <h4>A05 ContactView</h4>
    <div >
        <table class="table">
            <tbody>
            <tr class="active">
                <td>일련번호</td>
                <td></td>
            </tr>
            <tr class="active">
                <td>이름</td>
                <td></td>
            </tr>
            <tr class="active">
                <td>전화</td>
                <td></td>
            </tr>
            <tr class="active">
                <td>주소</td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </div>
  </div>
</template>

<script>
import contactlist from './data/ContactList';

export default {
    data : function() {
        return {
            contacts : contactlist.contacts
        }
    },
    computed : {
        
    }
}
</script>
