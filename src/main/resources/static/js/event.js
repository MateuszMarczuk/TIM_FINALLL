 // $(function() {
 //    var dialog, form,
 //
 //     	tips = $( ".validateTips" );
 //
 //    function validateDateRange(start, end) {
 //
 //    	if(!start.isValid()) {
 //    		alert("Start date is invalid");
 //    		return false;
 //    	}
 //
 //    	if(!end.isValid()) {
 //    		alert("End date is invalid");
 //    		return false;
 //    	}
 //
 //    	if(start.isAfter(end)) {
	//  		alert("End date must be after start date");
	//  		return false;
	//  	}
 //
 //    	if(start.isSame(end)) {
 //    		alert("End date must be after start date");
 //    		return false;
 //    	}
 //    	return true;
 //    }
 //
 //
 //   	function removeEvent() {
 //
 //   		var eventStart = moment(modstartdateandtime.value);
 // 			var eventEnd = moment(modenddateandtime.value);
 //
 //    	var eventData;
	// 	if (moduid.value) {
	// 		eventData = {
	// 			id: moduid.value,
	// 			title: modtitle.value,
	// 			start: eventStart,
	// 			end: eventEnd,
	// 			description: moddescription.value
	// 		};
 //
 //    		editDialog.dialog( "close" );
 //
	//     	$.ajax({
	// 		    type: "DELETE",
	// 		    url: "/removeevent",
	// 		    data: JSON.stringify(eventData),
	// 		    contentType: "application/json; charset=utf-8",
	// 		    dataType: "json",
	// 		    success: function(data){
	// 		    	$('#calendar').fullCalendar('refetchEvents');
	// 		    },
	// 		    failure: function(errMsg) {
	// 		        alert(errMsg);
	// 		    }
	// 		});
	// 	}
	//     return true;
 //    }
 //
 //    function editEvent(event, elements) {
 //    	var eventStart = moment(event.start).format("YYYY-MM-DDTHH:mm:ss"); //moment(event.start);
 // 			var eventEnd = moment(event.end).format("YYYY-MM-DDTHH:mm:ss");
 //
 // 			alert (eventStart + "   " + eventEnd + "   " + event.end);
 //       	modtitle.value = event.title;
	//     moddescription.value = event.description;
	//     modstartdateandtime.value = eventStart;
	//     modenddateandtime.value = eventEnd;
	//     moduid.value = event.id;
	//     editDialog.dialog( "open" );
 //    }
 //
 //    function saveEvent() {
 //    	var valid = true;
 //
	//  	var eventStart = moment(modstartdateandtime.value);
 // 			var eventEnd = moment(modenddateandtime.value);
 //
 //        valid = valid && modtitle.value;
	//  	valid = valid && startdateandtime.value;
	//  	valid = valid && validateDateRange(eventStart, eventEnd);
 //
	// 	if ( valid ) {
	//     	var eventData;
	// 		if (modtitle.value) {
	// 			eventData = {
	// 				id: moduid.value,
	// 				title: modtitle.value,
	// 				start: eventStart,
	// 				end:  eventEnd,
	// 				description: moddescription.value
	// 			};
	// 	//		alert(eventData.title.value + " " + eventData.start.value + " " + eventData.end.value)
	// 	//		$('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
	// 		}
	// 		$('calendar').fullCalendar('unselect');
 //
	//     	editDialog.dialog( "close" );
 //            $("#calendar").fullCalendar('removeEvents', function(eventObject) {
 //                return true;
 //            });
	//     	$.ajax({
	// 		    type: "post",
	// 		    url: "/updateevent",
	// 		    data: JSON.stringify(eventData),
	// 		    contentType: "application/json; charset=utf-8",
	// 		    dataType: "json",
	// 		    success: function(data){
	// 		    	$('#calendar').fullCalendar( 'refetchEvents' );
	// 		    },
	// 		    failure: function(errMsg) {
	// 		        alert(errMsg);
	// 		    }
 //
	// 		});
 //    	}
	//  	return valid;
 //    }
 //
 //    function addEvent(start, end) {
 //      	var valid = true;
 //
 // 			var eventStart = moment(startdateandtime.value);
 // 			var eventEnd = moment(enddateandtime.value);
 //
	// 	valid = valid && newtitle.value;
	//  	valid = valid && startdateandtime.value;
	//  	valid = valid && validateDateRange(eventStart, eventEnd);
 //
	// 	if ( valid ) {
	//     	var eventData;
	// 		if (newtitle.value) {
	// 			eventData = {
	// 				title: newtitle.value,
	// 				description: description.value,
	// 				start: eventStart,
	// 				end: eventEnd,
	// 			};
	// 			//$('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
	// 		}
 //
	// 		$('calendar').fullCalendar('unselect');
	// 		dialog.dialog( "close" );
 //
	// 		 $.ajax({
	// 		    type: "POST",
	// 		    url: "/addevent",
	// 		    data: JSON.stringify(eventData),
	// 		    contentType: "application/json; charset=utf-8",
	// 		    dataType: "json",
	// 		    success: function(data){
	// 		    	$('#calendar').fullCalendar('renderEvent', data, true); // stick? = true
	// 		    },
	// 		    failure: function(errMsg) {
	// 		        alert(errMsg);
	// 		    }
	// 		});
 //      }
 //      return valid;
 //    }
 //
 //    dialog = $( "#dialog-form" ).dialog({
 //      autoOpen: false,
 //      height: 450,
 //      width: 350,
 //      modal: true,
 //      buttons: {
 //       "Create": addEvent,
 //        Cancel: function() {
 //          dialog.dialog( "close" );
 //        }
 //      },
 //      close: function() {
 //        form[ 0 ].reset();
 //      }
 //    });
 //
 //    editDialog = $( "#edit-dialog-form" ).dialog({
	//       autoOpen: false,
	//       height: 450,
	//       width: 350,
	//       modal: true,
	//       buttons: {
	//         Save: saveEvent,
	//         Delete: removeEvent,
	//         Cancel: function() {
	//           editDialog.dialog( "close" );
	//         }
	//       },
	//       close: function() {
	//         form[ 0 ].reset();
	//       }
	//     });
 //
 //    form = dialog.find( "form" ).on( "submit", function( event ) {
 //      event.preventDefault();
 //      addEvent();
 //    });
 //
 //    $( "#create-event" ).button().on( "click", function() {
 //      dialog.dialog( "open" );
 //    });
 //
 //    $(document).ready(function() {
 //
 //    	$('calendar').fullCalendar({
	// 		header: {
	// 			left: 'prev,next today',
	// 			center: 'title',
	// 			right: 'month,agendaWeek,agendaDay'
	// 		},
	// 		defaultDate: moment().format("YYYY-MM-DD"),
	// 		editable: true,
	// 		eventLimit: true, // allow "more" link when too many events
	// 		events: {
	// 	        url: '/events',
	// 	        type: 'GET',
	// 	        error: function() {
	// 	            alert('there was an error while fetching events!');
	// 	        },
	// 	        //color: 'blue',   // a non-ajax option
	// 	        //textColor: 'white' // a non-ajax option
	// 	    },
	// 		selectable: true,
	// 		selectHelper: true,
	// 		select: function(start, end) {
	// 			startdateandtime.value = moment(start).format("YYYY-MM-DDTHH:mm:ss");
	// 			enddateandtime.value = moment(end).format("YYYY-MM-DDTHH:mm:ss");
	// 			dialog.dialog( "open" );
	// 		},
	// 		eventClick: function(event, element) {
	// 			editEvent(event, element);
 //
	// 	       //$('#calendar').fullCalendar('updateEvent', event);
	// 	    },
	// 	    eventMouseover: function(event, jsEvent, view) {
	// 	   	},
	// 	    eventMouseout: function(event, jsEvent, view) {
	// 	    },
	// 		loading: function(bool) {
	// 			$('#loading').toggle(bool);
	// 		}
	// 	});
	// });
 //  });
