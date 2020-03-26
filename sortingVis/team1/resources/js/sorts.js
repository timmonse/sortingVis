var sorts = {

  Model: [
    {
      "type": "bubble sort"
    },
    {
      "type": "merge sort"
    },
    {
      "type": "selection sort"
    }
  ],

  addSorts: function(){
    var list = document.getElementById('SortList')
    for(var i=0; i<sorts.Model.length; i++){
      var entry = document.createElement('button');
      entry.innerHTML = sorts.Model[i].type;
      // entry.appendChild(document.createTextNode(sorts.Model[i].type));
      list.appendChild(entry);
    }
  }
}
