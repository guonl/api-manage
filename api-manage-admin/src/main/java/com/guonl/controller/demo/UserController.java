package com.guonl.controller.demo;


import com.guonl.model.form.UserForm;
import com.guonl.model.form.UserListForm;
import com.guonl.model.result.ApiResult;
import com.guonl.model.result.PageResult;
import com.guonl.model.result.user.UserVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by guonl
 * Date 2020/7/20 5:28 PM
 * Description: 用户接口
 */
@RequestMapping("/api/user/")
@RestController
public class UserController {


    /**
     * 用户列表
     * @param listForm
     * @author yedaxia
     */
    @RequestMapping(path = "list", method = {RequestMethod.GET,  RequestMethod.POST}  )
    public ApiResult<PageResult<UserVO>> list(UserListForm listForm){
        return null;
    }

    /**
     * 用户信息
     * @param userId 用户id
     * @author 周杰伦
     */
    @GetMapping("user-info/{userId}")
    public ApiResult<UserVO> userInfo(@PathVariable Long userId){
        return null;
    }

    /**
     * 保存用户
     * @param req
     * @param userForm
     * @return
     */
    @PostMapping(path = "save")
    public ApiResult<UserVO> saveUser(HttpServletResponse req, @RequestBody UserForm userForm){
        return null;
    }

    /**
     * 上传头像
     *
     * @param avatar
     * @return
     */
    @PostMapping("upload-avatar")
    public ApiResult uploadAvatar(MultipartFile avatar){
        return null;
    }

    /**
     * 修改用户信息
     * @param userForm
     * @return
     */
    @PostMapping("modify")
    public ApiResult<UserVO> modifyUser(UserForm userForm){
        return null;
    }

    /**
     * 删除用户
     * @param userId 用户ID
     */
    @PostMapping("delete")
    public ApiResult deleteUser(@RequestParam Long userId){
        return null;
    }

    public ApiResult hello(){
        return null;
    }
}
