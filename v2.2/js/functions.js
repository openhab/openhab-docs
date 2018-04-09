$(document).ready(function () {

    $('#oh2-checkbox').change(function () {
        if (this.checked) $('.since-2x').show('slow');
        else $('.since-2x').hide('slow');
    });

    $('#oh1-checkbox').change(function () {
        if (this.checked) $('.since-1x').show('slow');
        else $('.since-1x').hide('slow');
    });

    $('#legacy-checkbox').change(function () {
        if (this.checked) $('.install-legacy').show('slow');
        else $('.install-legacy').hide('slow');
    });

    $('#manual-checkbox').change(function () {
        if (this.checked) $('.install-manual').show('slow');
        else $('.install-manual').hide('slow');
    });
});

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
