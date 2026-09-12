import {api} from '../api/client'; export const orderService={list:()=>api('/orders'), updateStatus:(id,status)=>api(`/orders/${id}/status?status=${status}`,{method:'PATCH'})};
