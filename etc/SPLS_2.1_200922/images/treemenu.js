 $(document).ready(function () {
        
      $('.c_cnt').each(function (index){
          $(this).remove('.c_cnt');
      })

    });



       var label = '<label class="label_e" for="root">ROOT</label>';
        $(".category_list > li").prepend(label);


        var input = '<input type="checkbox" id="root">';
        //var input = '<input type="checkbox" id="root" checked="checked">';
        $(".category_list > li").prepend(input);

        var label = '<label class="label_b" for="root">ROOT</label>';
        $(".menu_list > li").prepend(label);


        var input = '<input type="checkbox" id="root" checked="checked">';
        //var input = '<input type="checkbox" id="root">';
        $(".menu_list > li").prepend(input);

 $(document).ready(function () {
        
      $('.c_cnt').each(function (index){
          $(this).remove('.c_cnt');
      })
     
      $('.tt_category input').each(function (index){
          $( this).attr('id','input'+index);
      })

      $('.tt_menu input').each(function (index){
          $( this).attr('id','input_b'+index);
      })

      $('.tt_category label').each(function (index){
          $(this).attr('for','input'+index);
      })

      $('.tt_menu label').each(function (index){
          $(this).attr('for','input_b'+index);
      })

      $('.category_list li .link_item').each(function (index){
            $(this).addClass('Cate'+index);
      })

      $('.menu_list li .link_item').each(function (index){
            $(this).addClass('Cate_b'+index);
      })
     



       $('.label_e').each(function (index){
            var Catename = $(".Cate"+index).text();
            $(this).addClass('Label_E'+index);
            $('.Label_E'+index).text(Catename);
        })

       $('.label_b').each(function (index){
            var Catename = $(".Cate_b"+index).text();
            $(this).addClass('Label_B'+index);
            $('.Label_B'+index).text(Catename);
        })




    });