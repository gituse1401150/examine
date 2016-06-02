package model.login;

import java.util.List;

import com.iciql.Db;

import datamodel.User;
import model.orm.IciqlObjectFactory;

public class Login {
	public User login(String id, String pass){
		Db db = new IciqlObjectFactory().getIciqlObject();
		model.orm.mapper.User user = new model.orm.mapper.User();
		List<model.orm.mapper.User> r = db.from(user)
										.where(user.mail_address).is(id)
										.and(user.user_pass).is(pass)
										.select();
		if(r.isEmpty()){
			return new User();
		}else{
			User u = new User();
			model.orm.mapper.User uo = r.get(0);
			u.name = uo.user_name;
			u.name_kana = uo.user_name_kana;
			u.class_id = uo.class_id;
			model.orm.mapper.Class c = new model.orm.mapper.Class();
			List<model.orm.mapper.Class> cl = db.from(c)
												.where(c.class_id).is(uo.class_id)
												.select();

			u.class_name = cl.get(0).class_name;
			u.mail = uo.mail_address;
			u.manage_flg = uo.admin_flag;
			u.islogin = true;
			return u;
		}
	}
}
