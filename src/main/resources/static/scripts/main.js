function remove(id){
   const xhr = new XMLHttpRequest();
   xhr.open('Delete',window.location.href+"?uuid"+id,true);
   xhr.setRequestHeader('Content-Type', 'application/json');
   xhr.send();
}