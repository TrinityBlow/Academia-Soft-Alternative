    $(document).ready(function() {
      $.subscribe('autocompleteChange', function(event, data) {
        var ui = event.originalEvent.ui;
        if(ui.item) {
            var message = ui.item.value;
            if(ui.item.key) {
                message = '( '+ ui.item.key +' ) '+message;
            }
            $('#topics').html('<b>'+message+'</b>');
        }
        });

      $.subscribe('autocompleteFocus', function(event, data) {
        var ui = event.originalEvent.ui;
        var message = ui.item.value;
        if(ui.item.key) {
            message = '( '+ ui.item.key +' ) '+message;
        }
            $('#topics').html('<u>'+message+'</u>');
        });

      $.subscribe('autocompleteSelect', function(event, data) {
        var ui = event.originalEvent.ui;
        var message = ui.item.value;
        if(ui.item.key) {
            message = '( '+ ui.item.key +' ) '+message;
        }
            $('#topics').html('<i>'+message+'</i>');
        });
    });