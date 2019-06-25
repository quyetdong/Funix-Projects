
$(document).ready(function() {
	$('#dropdown_title').click(function() {
		$('#dropdown_menu .dhidden').slideToggle('fast');
	});	
	
	var dropDown = [];
	var dataForm = [];
		
	for (var i=0; i<4; i++) {
		dropDown[i] = '#dropdown_menu .drop' + (i + 1);
		dataForm[i] = '#dataForm, #dataForm .form' + (i+1);
	}		
		
	function click_drop(j) {						
		$(dropDown[j]).click(function() {
			$(dataForm[dataForm.length-1]).hide();
			$(dataForm[j]).show();
			$('ul span.inpInstr').removeClass('inpRed').addClass('hidden');
		});
	}
		
	click_drop(0);
	click_drop(1);
	click_drop(2);
	click_drop(3);

	function inputObj() {
		this.name = [];
		this.classArr = [];
		this.email = [];
		this.phone = [];
		this.literature = [];
		this.morality = [];
		this.programming = [];
	}
	
	var inpData = new inputObj();
	var inpInstr = new inputObj();
	
	for (i=0; i<4; i++) {
		inpData.name[i] = 'input:text[name=fullName' + (i+1) + ']';
		inpData.classArr[i] = 'input:text[name=className' +(i+1) + ']';
		inpData.email[i] = 'input[name=emailAdd' + (i+1) + ']';
		inpData.phone[i] = 'input[name=phoneNum' + (i+1) + ']';
		inpData.literature[i] = 'input[name=literature' + (i+1) + ']';
		inpData.morality[i] = 'input[name=morality' + (i+1) + ']';
		inpData.programming[i] = 'input[name=programming' + (i+1) + ']';
		inpInstr.name[i] = '#inpName' + (i+1);
		inpInstr.classArr[i] = '#inpClass' + (i+1);
		inpInstr.email[i] = '#inpEmail' + (i+1);
		inpInstr.phone[i] = '#inpPhoneNum' + (i+1);
		inpInstr.literature[i] = '#inpLiterature' + (i+1);
		inpInstr.morality[i] = '#inpMoral' + (i+1);
		inpInstr.programming[i] = '#inpProgram' + (i+1);
	}
	
	var button1Inp= [];
	var average = [];
	var button1Stt=0;
	
	$('#button1').click(function(){				
		for (i=0; i<4; i++) {
			button1Inp[i] = 'true';
			if($.trim($(inpData.name[i]).val()) == '') {
				$(inpInstr.name[i]).removeClass('hidden').addClass('inpRed');
				button1Inp[i]='false';
			} else {$(inpInstr.name[i]).removeClass('inpRed').addClass('hidden');}
		
			if($.trim($(inpData.classArr[i]).val()) == '') {
				$(inpInstr.classArr[i]).removeClass('hidden').addClass('inpRed');
				button1Inp[i]='false';
			} else {$(inpInstr.classArr[i]).removeClass('inpRed').addClass('hidden');}
		
			var re = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,6})+$/;
			var is_email = re.test($(inpData.email[i]).val());
			if(is_email) {
				$(inpInstr.email[i]).removeClass('inpRed').addClass('hidden');
			
			} else {$(inpInstr.email[i]).removeClass('hidden').addClass('inpRed'); button1Inp[i]='false';}
		
			var phoneReg = /^\(?([0-9]{3,4})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
			var is_phone = phoneReg.test($.trim($(inpData.phone[i]).val()));
			if(is_phone) {
				$(inpInstr.phone[i]).removeClass('inpRed').addClass('hidden');
			} else {$(inpInstr.phone[i]).removeClass('hidden').addClass('inpRed'); button1Inp[i]='false';}
		
			if($.trim($(inpData.literature[i]).val()) == '') {
				$(inpInstr.literature[i]).removeClass('hidden').addClass('inpRed');
				button1Inp[i]='false';
			} else if (($.isNumeric($(inpData.literature[i]).val()) == false) || (0 > $(inpData.literature[i]).val()) || ($(inpData.literature[i]).val() > 10)) {
				$(inpInstr.literature[i]).removeClass('hidden').addClass('inpRed');
				button1Inp[i]='false';
			} else {$(inpInstr.literature[i]).removeClass('inpRed').addClass('hidden');}
		
			if($.trim($(inpData.morality[i]).val()) == '') {
				$(inpInstr.morality[i]).removeClass('hidden').addClass('inpRed');
				button1Inp[i]='false';
			} else if (($.isNumeric($(inpData.morality[i]).val()) == false) || (0 > $(inpData.morality[i]).val()) || ($(inpData.morality[i]).val() > 10)) {
				$(inpInstr.morality[i]).removeClass('hidden').addClass('inpRed');
				button1Inp[i]='false';
			} else {$(inpInstr.morality[i]).removeClass('inpRed').addClass('hidden');}
		
			if($.trim($(inpData.programming[i]).val()) == '') {
				$(inpInstr.programming[i]).removeClass('hidden').addClass('inpRed');
				button1Inp[i]='false';
			} else if (($.isNumeric($(inpData.programming[i]).val()) == false) || (0 > $(inpData.programming[i]).val()) || ($(inpData.programming[i]).val() > 10)) {
				$(inpInstr.programming[i]).removeClass('hidden').addClass('inpRed');
				button1Inp[i]='false';
			} else {$(inpInstr.programming[i]).removeClass('inpRed').addClass('hidden');}
				
			
			if (button1Inp[i]=='true') {
				average[button1Stt] = ((parseFloat($(inpData.literature[i]).val()) + parseFloat($(inpData.morality[i]).val()) + parseFloat($(inpData.programming[i]).val()))/3).toFixed(2);
				button1Stt = button1Stt + 1;
				$('div.table table').append(
					'<tr id=\'student' + button1Stt + '\'>' +
					'<td class=\'indexCol\'>' + button1Stt + '</td>' + 
					'<td class=\'studentCol\'>' + $.trim($(inpData.name[i]).val()) + '</td>' +
					'<td class=\'classCol\'>' + $.trim($(inpData.classArr[i]).val()) + '</td>' +
					'<td class=\'emailCol\'>' + $.trim($(inpData.email[i]).val()) + '</td>' +
					'<td class=\'phoneCol\'>' + $.trim($(inpData.phone[i]).val()) + '</td>' +
					'<td class=\'literatureCol tdMark' + button1Stt + '\'>' + $.trim($(inpData.literature[i]).val()) + '</td>' +
					'<td class=\'moralCol tdMark' + button1Stt + '\'>' + $.trim($(inpData.morality[i]).val()) + '</td>' +
					'<td class=\'programCol tdMark' + button1Stt + '\'>' + $.trim($(inpData.programming[i]).val()) + '</td>' +
					'<td class=\'averCol averRed tdMark' + button1Stt + '\'' + ' id=\'average' + button1Stt + '\'>' + '?' + '</td>' +
					'</tr>');
				$(inpData.name[i]).val('');
				$(inpData.classArr[i]).val('');
				$(inpData.email[i]).val('');
				$(inpData.phone[i]).val('');
				$(inpData.literature[i]).val('');
				$(inpData.morality[i]).val('');
				$(inpData.programming[i]).val('');		
			}		 
		}
	});
	
	$('#average').click(function() {
		for (i=0; i<button1Stt; i++) {
			var averageIndex = 'div.table table #average' + (i + 1);
			$(averageIndex).text(average[i]);
		}
	});

	var mark={};
	$('#goodStudent').click(function() {
		for (i=0; i<button1Stt; i++) {
			for (j=6; j<10; j++) {
				var tdItem = 'td.tdMark' + (i+1) + ':nth-child(' + j +')';
				mark[tdItem] = $(tdItem).text();
				var evalMark = mark[tdItem];
				/* console.log(evalMark); */
				if (evalMark>8 || evalMark==8) {
					$(tdItem).addClass('goodMark');
				}
				if (evalMark<5) {
					$(tdItem).addClass('badMark');
					if (j==9) {
						$(tdItem).removeClass('averRed');
					}
				}			
			}
		}			
	});

	
});
