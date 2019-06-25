
$(document).ready(function() {
	var $name = $('input:text[name=fullName]');
	var $learnClass = $('input:text[name=learnClass]');
	var $mathsMark = $('input:text[name=maths]');
	var $physicsMark = $('input:text[name=physics]');
	var $chemistryMark = $('input:text[name=chemistry]');
	var $notify = $('form #notify');
	var $average = [];
	var $button1num=0;
	
	$('#button1').click(function(){
		$('ul#notify').empty();
		var $button1='true';
				
		if($.trim($name.val()) == '') {
			$('form ul#notify').append('<li><span>Họ tên bắt buộc nhập, không để trống</span></li>');
			$button1='false';
		}
		
		if($.trim($learnClass.val()) == '') {
			$('form ul#notify').append('<li><span>Lớp bắt buộc nhập, không để trống</span></li>');
			$button1='false';
		}
		
		if($.trim($mathsMark.val()) == '') {
			$('form ul#notify').append('<li><span>Xin nhập điểm Toán, không để trống</span></li>');
			$button1='false';
		} else if (($.isNumeric($mathsMark.val()) == false) || (0 > $mathsMark.val()) || ($mathsMark.val() > 10)) {
			$('form ul#notify').append('<li><span>Điểm Toán phải là số trong đoạn từ 0 đến 10</span></li>');
			$button1='false';
		}
		
		if($.trim($physicsMark.val()) == '') {
			$('form ul#notify').append('<li><span>Xin nhập điểm Vật lý, không để trống</span></li>');
			$button1='false';
		} else if (($.isNumeric($physicsMark.val()) == false) || (0 > $physicsMark.val()) || ($physicsMark.val() > 10)) {
			$('form ul#notify').append('<li><span>Điểm Lý phải là số trong đoạn từ 0 đến 10</span></li>');
			$button1='false';
		}
		
		if($.trim($chemistryMark.val()) == '') {
			$('form ul#notify').append('<li><span>Xin nhập điểm Hóa học, không để trống</span></li>');
			$button1='false';
		} else if (($.isNumeric($chemistryMark.val()) == false) || (0 > $chemistryMark.val()) || ($chemistryMark.val() > 10)) {
			$('form ul#notify').append('<li><span>Điểm Hóa phải là số trong đoạn từ 0 đến 10</span></li>');
			$button1='false';
		}
		
		if ($button1=='true') {
			$average[$button1num] = ((parseInt($mathsMark.val()) + parseInt($physicsMark.val()) + parseInt($chemistryMark.val()))/3).toFixed(2);
			$button1num = $button1num + 1;
			$('div.table table').append(
				'<tr id=\'student' + $button1num + '\'><td class=\'indexCol\'>' + $button1num + '</td>' + 
					'<td class=\'studentCol\'>' + $.trim($name.val()) + '</td>' +
					'<td class=\'mathsCol\'>' + $.trim($mathsMark.val()) + '</td>' +
					'<td class=\'physicsCol\'>' + $.trim($physicsMark.val()) + '</td>' +
					'<td class=\'chemCol\'>' + $.trim($chemistryMark.val()) + '</td>' +
					'<td class=\'averCol\' id=\'average' + $button1num +  '\'>' + '?' + '</td>' +
				'</tr>');
		}		
	});
	
	$('#average').click(function() {
		for (i=0; i<$average.length; i++) {
			var $averageIndex = 'div.table table #average' + (i + 1);
			$($averageIndex).text($average[i]);
		}
	});
	
	$('#goodStudent').click(function() {
		for (i=0; i<$average.length; i++) {
			if(($average[i] > 8) || ($average[i] == 8)) {
				var $idGoodStudent = 'tr#student' + (i + 1);
				$($idGoodStudent).addClass('studentHightLight');
			}
		
		}
	});

	
});
