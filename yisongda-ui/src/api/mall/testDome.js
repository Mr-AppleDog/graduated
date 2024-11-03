import request from '@/utils/request'

// 查询测试列表
export function listTestDome(query) {
  return request({
    url: '/mall/testDome/list',
    method: 'get',
    params: query
  })
}

// 查询测试详细
export function getTestDome(id) {
  return request({
    url: '/mall/testDome/' + id,
    method: 'get'
  })
}

// 新增测试
export function addTestDome(data) {
  return request({
    url: '/mall/testDome',
    method: 'post',
    data: data
  })
}

// 修改测试
export function updateTestDome(data) {
  return request({
    url: '/mall/testDome',
    method: 'put',
    data: data
  })
}

// 删除测试
export function delTestDome(id) {
  return request({
    url: '/mall/testDome/' + id,
    method: 'delete'
  })
}
