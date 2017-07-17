var BR ="<br / >";
function setup() {
  $("#submitButton").click(postComment);

}
function postComment(){
  var comment = $("#commentArea").val();
  $("#displayComments").append(comment+BR)
}
$('document').ready(setup)
function test() {
  alert('jello world');
}
