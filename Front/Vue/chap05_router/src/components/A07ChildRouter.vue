<template>
    <div>
        <h4>A04 Contacts</h4>

        <div>
            <span></span>
        </div>
        <br />

        <div></div>
    </div>
</template>

<script>
import contactlist from './data/ContactList';

export default {
    data: function () {
        return {
            contacts: contactlist.contacts,
        };
    },
};
</script>

<style>
</style>