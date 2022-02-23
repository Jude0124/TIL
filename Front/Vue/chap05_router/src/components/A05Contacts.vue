<template>
    <div>
        <h4>A05 Contacts</h4>

        <div>
            <span> </span>
        </div>
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
