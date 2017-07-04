function printPage() {

  var allContent = document.getElementsByClassName('content');

  if (allContent[0] == null) {
    allContent = document.getElementsByClassName('container target');
  }

  var mainContent = allContent[0];

  if (mainContent != null) {
    var printingWindow = window.open('','','left=0,top=0,width=800,height=900,toolbar=0,scrollbars=0,status=0');

    printingWindow.document.write(mainContent.innerHTML);
    printingWindow.document.close();
    printingWindow.focus();
    printingWindow.print();
    printingWindow.close();
  }
  return false;
}

