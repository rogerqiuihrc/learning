Ext.define('My.sample.Person', {
    name: 'Unknown',
    constructor: function(name) {
        if (name) {
            this.name = name;
        }r
        return this;
    },
    eat: function(foodType) {
        alert(this.name + "iseating:" + foodType);
        return this;
    }
});
var aaron = Ext.create('My.sample.Person', 'Aaron');
aaron.eat("Salad")